FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

PRINC := "${@int(PRINC) + 10}"

SRCREV_mxs = "e173f4e81de158e68f36e59981327648a13cc30b"

SRC_URI = "git://github.com/cyox93/linux-imx.git \
           file://defconfig \
"

