package org.eightyeight.zcw.domain.universe.structure;

/**
 * Created by rickjackson on 3/28/17.
 */
public enum SourceStructureNodesTypes {
    MAGAZINE {
        @Override
        public String toString() {
            return "Magazine";
        }
    },
    
    VOLUME {
        @Override
        public String toString() {
            return "Volume";
        }
    },
    
    ISSUE {
        @Override
        public String toString() {
            return "Issue";
        }
    },
    
    PAGE {
        @Override
        public String toString() {
            return "Page";
        }
    };
    
    public abstract String toString();
}
