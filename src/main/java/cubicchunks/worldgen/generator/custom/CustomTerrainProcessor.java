/*
 *  This file is part of Cubic Chunks Mod, licensed under the MIT License (MIT).
 *
 *  Copyright (c) 2015 contributors
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package cubicchunks.worldgen.generator.custom;

import cubicchunks.world.ICubicWorld;
import cubicchunks.worldgen.generator.ICubePrimer;
import mcp.MethodsReturnNonnullByDefault;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

// TODO remove me - generator pipeline leftover
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public final class CustomTerrainProcessor {

    @Nonnull private final CustomTerrainGenerator terrainGenerator;

    public CustomTerrainProcessor(ICubicWorld world) {
        this.terrainGenerator = new CustomTerrainGenerator(world, world.getSeed());
    }

    public void calculate(final ICubePrimer cube, int cubeX, int cubeY, int cubeZ) {
        this.terrainGenerator.generate(cube, cubeX, cubeY, cubeZ);
    }
}
