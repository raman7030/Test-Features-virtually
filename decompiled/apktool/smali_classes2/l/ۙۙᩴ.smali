.class public final Ll/ۙۙᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final h:Ll/ۡ֨ᩴ;

.field public static final i:Ljava/util/Map;


# instance fields
.field public a:Ll/ۙۙᩴ;

.field public final b:Ll/ۙۙᩴ;

.field public final c:Ljava/util/List;

.field public final d:Z

.field public e:I

.field public f:C

.field public g:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 158
    new-instance v0, Ll/ۡ֨ᩴ;

    const/4 v1, 0x2

    .line 0
    invoke-direct {v0, v1}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 158
    sput-object v0, Ll/ۙۙᩴ;->h:Ll/ۡ֨ᩴ;

    .line 1999
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۙۙᩴ;->i:Ljava/util/Map;

    const/16 v1, 0x47

    .line 2002
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x79

    .line 2003
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->YEAR_OF_ERA:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x75

    .line 2004
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x51

    .line 2005
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/᩹ۗᩴ;->a:Ll/ܶۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x71

    .line 2006
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x4d

    .line 2007
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x4c

    .line 2008
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x44

    .line 2009
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x64

    .line 2010
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x46

    .line 2011
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->ALIGNED_DAY_OF_WEEK_IN_MONTH:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x45

    .line 2012
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x63

    .line 2013
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x65

    .line 2014
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x61

    .line 2015
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->AMPM_OF_DAY:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x48

    .line 2016
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x6b

    .line 2017
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->CLOCK_HOUR_OF_DAY:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x4b

    .line 2018
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->HOUR_OF_AMPM:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x68

    .line 2019
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->CLOCK_HOUR_OF_AMPM:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x6d

    .line 2020
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x73

    .line 2021
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x53

    .line 2022
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x41

    .line 2023
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v3, Ll/ᩴۗᩴ;->MILLI_OF_DAY:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x6e

    .line 2024
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x4e

    .line 2025
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ᩴۗᩴ;->NANO_OF_DAY:Ll/ᩴۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x67

    .line 2026
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    sget-object v2, Ll/ۙۗᩴ;->a:Ll/᩶ۗᩴ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 256
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    iput-object p0, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    .line 174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙۙᩴ;->c:Ljava/util/List;

    const/4 v0, -0x1

    .line 190
    iput v0, p0, Ll/ۙۙᩴ;->g:I

    const/4 v0, 0x0

    .line 257
    iput-object v0, p0, Ll/ۙۙᩴ;->b:Ll/ۙۙᩴ;

    const/4 v0, 0x0

    .line 258
    iput-boolean v0, p0, Ll/ۙۙᩴ;->d:Z

    return-void
.end method

.method public constructor <init>(Ll/ۙۙᩴ;)V
    .locals 1

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    iput-object p0, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    .line 174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙۙᩴ;->c:Ljava/util/List;

    const/4 v0, -0x1

    .line 190
    iput v0, p0, Ll/ۙۙᩴ;->g:I

    .line 269
    iput-object p1, p0, Ll/ۙۙᩴ;->b:Ll/ۙۙᩴ;

    const/4 p1, 0x1

    .line 270
    iput-boolean p1, p0, Ll/ۙۙᩴ;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Ll/ۛ᩶ᩴ;)V
    .locals 2

    const-string v0, "formatter"

    .line 1469
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2077
    iget-object p1, p1, Ll/ۛ᩶ᩴ;->a:Ll/ᩳۙᩴ;

    .line 2343
    iget-boolean v0, p1, Ll/ᩳۙᩴ;->b:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2346
    :cond_0
    new-instance v0, Ll/ᩳۙᩴ;

    iget-object p1, p1, Ll/ᩳۙᩴ;->a:[Ll/ܳۙᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ᩳۙᩴ;-><init>([Ll/ܳۙᩴ;Z)V

    move-object p1, v0

    .line 1470
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    return-void
.end method

.method public final b(Ll/ᩴۗᩴ;IIZ)V
    .locals 1

    if-ne p2, p3, :cond_0

    if-nez p4, :cond_0

    .line 715
    new-instance v0, Ll/ۜۙᩴ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/ۜۙᩴ;-><init>(Ll/ۤۗᩴ;IIZ)V

    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    return-void

    .line 717
    :cond_0
    new-instance v0, Ll/ۜۙᩴ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/ۜۙᩴ;-><init>(Ll/ۤۗᩴ;IIZ)V

    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    return-void
.end method

.method public final c(Ll/ܳۙᩴ;)I
    .locals 4

    const-string v0, "pp"

    .line 2169
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2170
    iget-object v0, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iget v1, v0, Ll/ۙۙᩴ;->e:I

    if-lez v1, :cond_1

    if-eqz p1, :cond_0

    .line 2172
    new-instance v2, Ll/ᩴۙᩴ;

    iget-char v3, v0, Ll/ۙۙᩴ;->f:C

    invoke-direct {v2, p1, v1, v3}, Ll/ᩴۙᩴ;-><init>(Ll/ܳۙᩴ;IC)V

    move-object p1, v2

    :cond_0
    const/4 v1, 0x0

    .line 2174
    iput v1, v0, Ll/ۙۙᩴ;->e:I

    .line 2175
    iput-char v1, v0, Ll/ۙۙᩴ;->f:C

    .line 2177
    :cond_1
    iget-object v0, v0, Ll/ۙۙᩴ;->c:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2178
    iget-object p1, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    const/4 v0, -0x1

    iput v0, p1, Ll/ۙۙᩴ;->g:I

    .line 2179
    iget-object p1, p1, Ll/ۙۙᩴ;->c:Ljava/util/List;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final d(C)V
    .locals 1

    .line 1432
    new-instance v0, Ll/ۧۙᩴ;

    invoke-direct {v0, p1}, Ll/ۧۙᩴ;-><init>(C)V

    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 2

    const-string v0, "literal"

    .line 1447
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1448
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1449
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1450
    new-instance v0, Ll/ۧۙᩴ;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-direct {v0, p1}, Ll/ۧۙᩴ;-><init>(C)V

    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    return-void

    .line 1452
    :cond_0
    new-instance v0, Ll/ܺۙᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/ܺۙᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    :cond_1
    return-void
.end method

.method public final f(Ll/᩷ۙᩴ;)V
    .locals 2

    const-string v0, "style"

    .line 1024
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1025
    sget-object v0, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/᩷ۙᩴ;->SHORT:Ll/᩷ۙᩴ;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 1026
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Style must be either full or short"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1028
    :cond_1
    :goto_0
    new-instance v0, Ll/ܺۙᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Ll/ܺۙᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 990
    new-instance v0, Ll/ۘۙᩴ;

    invoke-direct {v0, p1, p2}, Ll/ۘۙᩴ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    return-void
.end method

.method public final h(Ll/ᩴۗᩴ;Ljava/util/Map;)V
    .locals 2

    const-string v0, "field"

    .line 799
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "textLookup"

    .line 800
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 801
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 802
    sget-object p2, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    invoke-static {p2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    .line 803
    new-instance v1, Ll/ۨ᩶ᩴ;

    invoke-direct {v1, v0}, Ll/ۨ᩶ᩴ;-><init>(Ljava/util/Map;)V

    .line 804
    new-instance v0, Ll/᩺᩶ᩴ;

    invoke-direct {v0, v1}, Ll/᩺᩶ᩴ;-><init>(Ll/ۨ᩶ᩴ;)V

    .line 825
    new-instance v1, Ll/ܶۙᩴ;

    invoke-direct {v1, p1, p2, v0}, Ll/ܶۙᩴ;-><init>(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;Ll/ܰ᩶ᩴ;)V

    invoke-virtual {p0, v1}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    return-void
.end method

.method public final i(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;)V
    .locals 2

    const-string v0, "field"

    .line 758
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "textStyle"

    .line 759
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 760
    new-instance v0, Ll/ܶۙᩴ;

    .line 120
    sget-object v1, Ll/ܰ᩶ᩴ;->c:Ll/ܰ᩶ᩴ;

    .line 760
    invoke-direct {v0, p1, p2, v1}, Ll/ܶۙᩴ;-><init>(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;Ll/ܰ᩶ᩴ;)V

    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    return-void
.end method

.method public final j(Ll/ۖۙᩴ;)V
    .locals 5

    .line 648
    iget-object v0, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iget v1, v0, Ll/ۙۙᩴ;->g:I

    if-ltz v1, :cond_1

    .line 652
    iget-object v0, v0, Ll/ۙۙᩴ;->c:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۙᩴ;

    .line 653
    iget v2, p1, Ll/ۖۙᩴ;->b:I

    iget v3, p1, Ll/ۖۙᩴ;->c:I

    if-ne v2, v3, :cond_0

    .line 0
    iget-object v2, p1, Ll/ۖۙᩴ;->d:Ll/᩻ۙᩴ;

    .line 653
    sget-object v4, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    if-ne v2, v4, :cond_0

    .line 655
    invoke-virtual {v0, v3}, Ll/ۖۙᩴ;->e(I)Ll/ۖۙᩴ;

    move-result-object v0

    .line 657
    invoke-virtual {p1}, Ll/ۖۙᩴ;->d()Ll/ۖۙᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 659
    iget-object p1, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iput v1, p1, Ll/ۙۙᩴ;->g:I

    goto :goto_0

    .line 662
    :cond_0
    invoke-virtual {v0}, Ll/ۖۙᩴ;->d()Ll/ۖۙᩴ;

    move-result-object v0

    .line 664
    iget-object v2, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    invoke-virtual {p0, p1}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    move-result p1

    iput p1, v2, Ll/ۙۙᩴ;->g:I

    .line 667
    :goto_0
    iget-object p1, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iget-object p1, p1, Ll/ۙۙᩴ;->c:Ljava/util/List;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 670
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    move-result p1

    iput p1, v0, Ll/ۙۙᩴ;->g:I

    return-void
.end method

.method public final k(Ll/ۤۗᩴ;)V
    .locals 4

    const-string v0, "field"

    .line 409
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 410
    new-instance v0, Ll/ۖۙᩴ;

    const/16 v1, 0x13

    sget-object v2, Ll/᩻ۙᩴ;->NORMAL:Ll/᩻ۙᩴ;

    const/4 v3, 0x1

    invoke-direct {v0, p1, v3, v1, v2}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    return-void
.end method

.method public final l(Ll/ۤۗᩴ;I)V
    .locals 2

    const-string v0, "field"

    .line 463
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    const/16 v0, 0x13

    if-gt p2, v0, :cond_0

    .line 467
    new-instance v0, Ll/ۖۙᩴ;

    sget-object v1, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    invoke-direct {v0, p1, p2, p2, v1}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    .line 468
    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    return-void

    .line 465
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "The width must be from 1 to 19 inclusive but was "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V
    .locals 2

    if-ne p2, p3, :cond_0

    .line 505
    sget-object v0, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    if-ne p4, v0, :cond_0

    .line 506
    invoke-virtual {p0, p1, p3}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    return-void

    :cond_0
    const-string v0, "field"

    .line 508
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "signStyle"

    .line 509
    invoke-static {p4, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x1

    if-lt p2, v0, :cond_3

    const/16 v1, 0x13

    if-gt p2, v1, :cond_3

    if-lt p3, v0, :cond_2

    if-gt p3, v1, :cond_2

    if-lt p3, p2, :cond_1

    .line 520
    new-instance v0, Ll/ۖۙᩴ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/ۖۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    .line 521
    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    return-void

    .line 517
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "The maximum width must exceed or equal the minimum width but "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " < "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 514
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "The maximum width must be from 1 to 19 inclusive but was "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 511
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "The minimum width must be from 1 to 19 inclusive but was "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n()V
    .locals 3

    .line 2148
    iget-object v0, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iget-object v1, v0, Ll/ۙۙᩴ;->b:Ll/ۙۙᩴ;

    if-eqz v1, :cond_1

    .line 2151
    iget-object v0, v0, Ll/ۙۙᩴ;->c:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2152
    new-instance v0, Ll/ᩳۙᩴ;

    iget-object v1, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iget-object v2, v1, Ll/ۙۙᩴ;->c:Ljava/util/List;

    iget-boolean v1, v1, Ll/ۙۙᩴ;->d:Z

    invoke-direct {v0, v2, v1}, Ll/ᩳۙᩴ;-><init>(Ljava/util/List;Z)V

    .line 2153
    iget-object v1, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iget-object v1, v1, Ll/ۙۙᩴ;->b:Ll/ۙۙᩴ;

    iput-object v1, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    .line 2154
    invoke-virtual {p0, v0}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    return-void

    .line 2156
    :cond_0
    iget-object v0, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iget-object v0, v0, Ll/ۙۙᩴ;->b:Ll/ۙۙᩴ;

    iput-object v0, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    return-void

    .line 2149
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call optionalEnd() as there was no previous call to optionalStart()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o()V
    .locals 2

    .line 2117
    iget-object v0, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    const/4 v1, -0x1

    iput v1, v0, Ll/ۙۙᩴ;->g:I

    .line 2118
    new-instance v1, Ll/ۙۙᩴ;

    invoke-direct {v1, v0}, Ll/ۙۙᩴ;-><init>(Ll/ۙۙᩴ;)V

    iput-object v1, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    return-void
.end method

.method public final p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;
    .locals 1

    .line 2238
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Ll/ۙۙᩴ;->q(Ljava/util/Locale;Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final q(Ljava/util/Locale;Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;
    .locals 3

    const-string v0, "locale"

    .line 2249
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2250
    :goto_0
    iget-object v0, p0, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iget-object v0, v0, Ll/ۙۙᩴ;->b:Ll/ۙۙᩴ;

    if-eqz v0, :cond_0

    .line 2251
    invoke-virtual {p0}, Ll/ۙۙᩴ;->n()V

    goto :goto_0

    .line 2253
    :cond_0
    new-instance v0, Ll/ᩳۙᩴ;

    iget-object v1, p0, Ll/ۙۙᩴ;->c:Ljava/util/List;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ᩳۙᩴ;-><init>(Ljava/util/List;Z)V

    .line 2254
    new-instance v1, Ll/ۛ᩶ᩴ;

    sget-object v2, Ll/֫ۙᩴ;->a:Ll/֫ۙᩴ;

    invoke-direct {v1, v0, p1, p2, p3}, Ll/ۛ᩶ᩴ;-><init>(Ll/ᩳۙᩴ;Ljava/util/Locale;Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)V

    return-object v1
.end method
