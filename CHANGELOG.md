openengsb-domain-build-2.0.0 2012-01-09
---------------------------------------------------------------------

This release upgrades the domain to a) work with the OpenEngSB 2.4.0 and b) incorporated the
latest features of the new version (EDB integration, WSDLs for easy bridge integration, dedicated documentation).

Release Notes - OpenEngSB - Version domain-build-2.0.0

** Bug
    * [OPENENGSB-2320] - adapt build domain to current openengsb-framework
    * [OPENENGSB-2582] - Domains and Connectors need to include our snapshot repo to work with deployed snapshots correctly

** Improvement
    * [OPENENGSB-1804] - Enhance build domain with EDB CUD Events
    * [OPENENGSB-2586] - Include issuetracker, buildserver and inceptionYear from root

** New Feature
    * [OPENENGSB-2513] - move documentation to domain
    * [OPENENGSB-2575] - Include wsdl definition from 2.4.0 parent

** Task
    * [OPENENGSB-2566] - upgrade openengsb-domain-parent to 2.3.0 in all domains
    * [OPENENGSB-2596] - Adapt domain.name in domains to be e.g. AppointmentDomain instead of Appointment alone
    * [OPENENGSB-2620] - release domain-build-2.0.0

** Known Issues
    * [OPENENGSB-2621] - Domain definition is not suited for distributed builds


openengsb-domain-build-1.2.1 2011-05-23
---------------------------------------------------------------------

First support release of the Build Domain upgrading to the
latest OpenEngSB Framework version and including bundle.info.

** Library Upgrade
    * [OPENENGSB-1508] - Push connectors and domains to latest openengsb-framework-1.3.0.M1
    * [OPENENGSB-1609] - Upgrade openengsb-framework to 1.3.0.M2

** New Feature
    * [OPENENGSB-948] - Add OSGI-INF/bundle.info as used in Karaf to the openengsb bundles

** Task
    * [OPENENGSB-1424] - Release openengsb-domain-build-1.2.1


openengsb-domain-build-1.2.0 2011-04-26
---------------------------------------------------------------------

Initial release of the OpenEngSB Build Domain as standalone package

** Bug
    * [OPENENGSB-1395] - mvn scm tags point to openengsb instead of domain

** Library Upgrade
    * [OPENENGSB-1394] - Upgrade to openengsb-1.2.0.RC1

** Task
    * [OPENENGSB-1366] - Release openengsb-domain-build-1.2.0
    * [OPENENGSB-1396] - Add infrastructure for notice file generation
    * [OPENENGSB-1397] - Add ASF2 license file

