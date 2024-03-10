package vn.com.poly;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectModules;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import vn.com.poly.util.Suite1;
import vn.com.poly.util.Suite2;

@Suite
@SelectClasses({Suite2.class, Suite1.class})
//@SelectModules("demo_unit_test")
//@SelectPackages("vn.com.poly.util")
public class SuitesAll {
}
