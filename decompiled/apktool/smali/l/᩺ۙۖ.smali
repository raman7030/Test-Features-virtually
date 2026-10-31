.class public final Ll/᩺ۙۖ;
.super Ljava/lang/Object;
.source "75V0"

# interfaces
.implements Ll/֡ۙۖ;


# instance fields
.field public ֫:Z

.field public ۧ:Ll/᩶᩹ۖ;

.field public ܽ:[Ll/۟ۙۖ;

.field public final synthetic ܿ:I

.field public final synthetic ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(ILjava/util/HashMap;)V
    .locals 0

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/᩺ۙۖ;->ܿ:I

    iput-object p2, p0, Ll/᩺ۙۖ;->ᩳ:Ljava/util/HashMap;

    const/4 p2, 0x0

    .line 168
    iput-boolean p2, p0, Ll/᩺ۙۖ;->֫:Z

    .line 169
    new-array p1, p1, [Ll/۟ۙۖ;

    iput-object p1, p0, Ll/᩺ۙۖ;->ܽ:[Ll/۟ۙۖ;

    .line 170
    new-instance p1, Ll/ۨۙۖ;

    invoke-direct {p1, p0}, Ll/ۨۙۖ;-><init>(Ll/᩺ۙۖ;)V

    iput-object p1, p0, Ll/᩺ۙۖ;->ۧ:Ll/᩶᩹ۖ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 308
    iget v0, p0, Ll/᩺ۙۖ;->ܿ:I

    new-array v0, v0, [Ll/۟ۙۖ;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;Ll/֫ۙۖ;Ll/֫ۙۖ;)Ljava/lang/Object;
    .locals 5

    .line 166
    check-cast p1, [Ll/۟ۙۖ;

    check-cast p2, [Ll/۟ۙۖ;

    .line 249
    iget p3, p0, Ll/᩺ۙۖ;->ܿ:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_0

    .line 250
    new-array p2, p3, [Ll/۟ۙۖ;

    .line 251
    invoke-static {p1, v0, p2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_4

    .line 254
    aget-object v2, p1, v0

    .line 255
    aget-object v3, p2, v0

    if-eqz v2, :cond_3

    if-nez v3, :cond_1

    .line 258
    aput-object v2, p2, v0

    goto :goto_1

    :cond_1
    if-eq v2, v3, :cond_3

    .line 261
    iget-object v2, v2, Ll/۟ۙۖ;->ۧ:Ll/ܰۙۖ;

    if-eqz v2, :cond_2

    .line 263
    iput-boolean v1, v2, Ll/ܰۙۖ;->ܽ:Z

    .line 265
    :cond_2
    iget-object v2, v3, Ll/۟ۙۖ;->ۧ:Ll/ܰۙۖ;

    if-eqz v2, :cond_3

    .line 267
    iput-boolean v1, v2, Ll/ܰۙۖ;->ܽ:Z

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 275
    :cond_4
    :goto_2
    iget-object p3, p4, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v0, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-ne p3, v0, :cond_8

    .line 276
    check-cast p4, Ll/۬᩶ۖ;

    iget-object p3, p4, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz p3, :cond_8

    .line 277
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_8

    .line 278
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_8

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/᩸᩶ۖ;

    .line 96
    iget-object p4, p4, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 279
    invoke-virtual {p4}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object p4

    array-length v0, p4

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v0, :cond_5

    aget-object v3, p4, v2

    .line 280
    check-cast v3, Ll/ᩳ᩶ۖ;

    .line 281
    iget v3, v3, Ll/ᩳ᩶ۖ;->ۗ:I

    .line 282
    aget-object v4, p1, v3

    .line 283
    aget-object v3, p2, v3

    if-eqz v3, :cond_6

    .line 285
    iget-boolean v4, v3, Ll/۟ۙۖ;->֫:Z

    if-nez v4, :cond_7

    .line 286
    iget-object v3, v3, Ll/۟ۙۖ;->ۧ:Ll/ܰۙۖ;

    if-eqz v3, :cond_7

    .line 288
    iput-boolean v1, v3, Ll/ܰۙۖ;->ܽ:Z

    goto :goto_4

    :cond_6
    if-eqz v4, :cond_7

    .line 292
    iget-boolean v3, v4, Ll/۟ۙۖ;->֫:Z

    if-nez v3, :cond_7

    .line 293
    iget-object v3, v4, Ll/۟ۙۖ;->ۧ:Ll/ܰۙۖ;

    if-eqz v3, :cond_7

    .line 295
    iput-boolean v1, v3, Ll/ܰۙۖ;->ܽ:Z

    :cond_7
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    return-object p2
.end method

.method public final ֫(Ljava/lang/Object;Ll/֫ۙۖ;)Ljava/lang/Object;
    .locals 3

    .line 166
    check-cast p1, [Ll/۟ۙۖ;

    const/4 v0, 0x0

    .line 313
    iput-boolean v0, p0, Ll/᩺ۙۖ;->֫:Z

    .line 314
    iget v1, p0, Ll/᩺ۙۖ;->ܿ:I

    iget-object v2, p0, Ll/᩺ۙۖ;->ܽ:[Ll/۟ۙۖ;

    invoke-static {p1, v0, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 315
    iget-object p1, p0, Ll/᩺ۙۖ;->ۧ:Ll/᩶᩹ۖ;

    invoke-virtual {p1, p2}, Ll/᩶᩹ۖ;->֫(Ll/֫ۙۖ;)Ll/֫ۙۖ;

    .line 316
    iget-object p1, p2, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {p1}, Ljava/util/TreeSet;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 317
    iput-boolean v0, p0, Ll/᩺ۙۖ;->֫:Z

    .line 320
    :cond_0
    iget-boolean p1, p0, Ll/᩺ۙۖ;->֫:Z

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 321
    iput-object p1, p2, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    :cond_1
    return-object v2
.end method
