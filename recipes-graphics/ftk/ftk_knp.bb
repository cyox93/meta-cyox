SUMMARY = "Funny ToolKit"
DESCRIPTION = "FTK equals funny tool kit, write it just for fun."
SECTION = "libs"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=9bae5048295c38e9dd0d3bce3e4f9ffe"

HOMEPAGE = "http://code.google.com/p/ftk"
DEPENDS = "sysfsutils lua5.1 jpeg libpng freetype zlib tslib"

RV = "0.6.3"
PR = "r2"

SRC_URI = "git://github.com/cyox93/ftk.git \
		file://asound.state \
		file://desktop.sh"

SRCREV_imx23knp = "8298d93cafb2a6d69ab84713c9a14443aba5c712"

S = "${WORKDIR}/git"

inherit autotools binconfig pkgconfig update-rc.d

INITSCRIPT_NAME = "zdesktop.sh"
INITSCRIPT_PARAMS = "start 99 5 ."

PARALLEL_MAKE = ""

EXTRA_OECONF = "--disable-gtk-doc-html --enable-knp --with-fontengine=freetype --enable-tslib"

do_configure() {
	cd ${S}
	./autogen.sh
	oe_runconf
}

do_install_prepend() {
	install -d ${D}${sysconfdir}/init.d 
	install -m 0755 ${WORKDIR}/desktop.sh ${D}${sysconfdir}/init.d/zdesktop.sh
	install -m 0755 ${WORKDIR}/asound.state ${D}${sysconfdir}/asound.state
}

FILES_${PN} += "${libdir}/*${SOLIBS}"

