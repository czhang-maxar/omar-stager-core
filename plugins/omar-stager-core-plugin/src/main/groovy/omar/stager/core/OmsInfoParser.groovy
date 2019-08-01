package omar.stager.core

import groovy.util.slurpersupport.GPathResult
import omar.core.Repository

/**
 * Created by IntelliJ IDEA.
 * User: sbortman
 * Date: May 16, 2009
 * Time: 7:36:25 PM
 * To change this template use File | Settings | File Templates.
 */

public interface OmsInfoParser
{
  public def processDataSets(GPathResult oms, Repository repository);
}

