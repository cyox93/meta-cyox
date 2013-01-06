FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PRINC := "${@int(PRINC) + 2}"

# Board specific patches
SRC_URI_append_imx23knp = " file://linux_prep-fix-cmdlines-for-imx23knp.patch \
			file://boot_prep-add-MEM_MDDR-EMI_96M-define.patch"

