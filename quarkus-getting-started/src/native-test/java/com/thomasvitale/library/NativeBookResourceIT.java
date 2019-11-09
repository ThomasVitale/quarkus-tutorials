package com.thomasvitale.library;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
class NativeBookResourceIT extends BookResourceTest {

    // Execute the same tests but in native mode.
}