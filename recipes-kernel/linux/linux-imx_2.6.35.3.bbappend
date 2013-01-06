FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

PRINC := "${@int(PRINC) + 20}"

SRCREV_imx23knp = "9c340ba75b0ceab825d370781a3e7d317bc8810c"

SRC_URI_imx23knp = "git://github.com/cyox93/linux-imx.git;branch=linux-imx-knp \
           file://defconfig \
"

