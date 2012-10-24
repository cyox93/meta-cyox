FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

PRINC := "${@int(PRINC) + 10}"

SRCREV_mxs = "827f28552119b69f10e0428199d1c30fd63f13e2"

SRC_URI = "git://github.com/cyox93/linux-imx.git \
           file://defconfig \
"

