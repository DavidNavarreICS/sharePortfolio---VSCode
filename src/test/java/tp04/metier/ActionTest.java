/*
 * Copyright 2025 David Navarre &lt;David.Navarre at irit.fr&gt;.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tp04.metier;

import java.lang.reflect.Executable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author David Navarre &lt;David.Navarre at irit.fr&gt;
 */
class ActionTest {

    @Test
    void testBuildActionWithCorrectLabel_ShouldPass() {
        Assertions.assertDoesNotThrow(new org.junit.jupiter.api.function.Executable() {
            @Override
            public void execute() throws Throwable {
                new ActionImpl("CC!");
            }
        });
    }

    @Test
    void testBuildActionWithIncorrectLabel_ShouldNotPass() {
        Assertions.assertThrows(IllegalArgumentException.class, new org.junit.jupiter.api.function.Executable() {
            @Override
            public void execute() throws Throwable {
                new ActionImpl("");
            }
        });
    }

    private static class ActionImpl extends Action {

        public ActionImpl(final String libelle) {
            super(libelle);
        }

        public float valeur(Jour j) {
            return 0.0F;
        }
    }

}
