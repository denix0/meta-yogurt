DESCRIPTION = "Phytec wifi software"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# wpa_supplicant and wireless-tools are already install in packagegroup-base-wifi

RDEPENDS_${PN} = " \
    wpa-supplicant \
    iw \
    hostapd \
    linux-firmware-wl12xx \
    wl12xx-calibrator \
    laird-sterling-etsi \
    brcm-patchram-plus \
    ${@bb.utils.contains("STERLING_LWB_BACKPORT", "1", "backports-laird", "", d)} \
"
