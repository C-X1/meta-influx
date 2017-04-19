DESCRIPTION = "github.com/Shopify/sarama"

GO_IMPORT = "github.com/Shopify/sarama"

inherit go

SRC_URI = "git://github.com/Shopify/sarama;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "574d3147eee384229bf96a5d12c207fe7b5234f3" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=08a9a8182981c4db69e7e7bae5edc2e7"

FILES_${PN} += "${GOBIN_FINAL}/*"