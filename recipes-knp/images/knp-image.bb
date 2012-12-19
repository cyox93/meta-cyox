#
# Copyright (C) 2007 OpenedHand Ltd.
#
DESCRIPTION = "KNP project image."

IMAGE_FEATURES += "apps-console-core"

inherit core-image

IMAGE_INSTALL += " \
	mtd-utils \
	ftk \
	"
