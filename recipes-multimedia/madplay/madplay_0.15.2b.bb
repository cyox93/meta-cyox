DESCRIPTION = "Madplay is a command-line MPEG audio decoder and player"
SECTION = "console/multimedia"
DEPENDS = "libmad"
LICENSE = "GPL"
AUTHOR = "Robert Leslie <rob@mars.org>"
HOMEPAGE = "http://www.mars.org/home/rob/proj/mpeg/"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "ftp://ftp.mars.org/pub/mpeg/${PN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "5a79c7516ff7560dffc6a14399a389432bc619c905b13d3b73da22fa65acede0"

inherit autotools gettext

FILES_${PN} = "${bindir}/madplay"
