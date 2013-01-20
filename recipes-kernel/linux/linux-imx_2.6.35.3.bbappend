FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

PRINC := "${@int(PRINC) + 20}"

SRCREV_imx23knp = "7bc8d21b3e51c2a2ff078b1160877fcf2e5bb4f3"

SRC_URI_imx23knp = "git://github.com/cyox93/linux-imx.git;branch=linux-imx-knp \
           file://defconfig \
"

