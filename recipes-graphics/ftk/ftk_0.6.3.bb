SUMMARY = "Funny ToolKit"
DESCRIPTION = "FTK equals funny tool kit, write it just for fun."
SECTION = "libs"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=9bae5048295c38e9dd0d3bce3e4f9ffe"

HOMEPAGE = "http://code.google.com/p/ftk"
DEPENDS = "sysfsutils lua5.1 jpeg libpng freetype zlib tslib"

RV = "0.6.5"
PR = "r1"

SRC_URI = "http://ftk.googlecode.com/files/ftk-0.6.3.tar.bz2 \
		file://ftk-remove-app-music.patch"

SRC_URI[md5sum] = "437408c4a981b11b1fa1f93ab0ae5687"
SRC_URI[sha256sum] = "515c9a585ba7d6f7e54e416c9a1b7e13b7dc4b96ab14ed94982144bede25e3e7"

S = "${WORKDIR}/ftk"

inherit autotools binconfig pkgconfig

PARALLEL_MAKE = ""

EXTRA_OECONF = "--disable-gtk-doc-html"

do_configure() {
	cd ${S}
	./autogen.sh
	oe_runconf
}

