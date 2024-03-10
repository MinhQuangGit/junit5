package vn.com.poly.util;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectModules;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({Suite1.class, Suite2.class})
//@SelectModules("demo_unit_test")
//@SelectPackages("vn.com.poly.util")
public class SuitesAll {
}
