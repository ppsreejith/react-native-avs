using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNAvs
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAvsModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAvsModule"/>.
        /// </summary>
        internal RNAvsModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAvs";
            }
        }
    }
}
