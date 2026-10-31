.class public final Ll/ۨ֡ܽ;
.super Ll/ۛۚܽ;
.source "Z6QT"


# instance fields
.field public ۧ:[I

.field public ܽ:[Ll/ۛۚܽ;

.field public ܿ:I

.field public ᩳ:Ll/ۛۚܽ;


# direct methods
.method public constructor <init>(Ll/ۛۚܽ;Ll/ۛۚܽ;Ll/ۛۚܽ;)V
    .locals 2

    .line 1975
    invoke-direct {p0}, Ll/ۛۚܽ;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [Ll/ۛۚܽ;

    .line 1970
    iput-object v1, p0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    .line 1971
    iput v0, p0, Ll/ۨ֡ܽ;->ܿ:I

    .line 1976
    iput-object p3, p0, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    const/4 p3, 0x0

    aput-object p1, v1, p3

    const/4 p1, 0x1

    aput-object p2, v1, p1

    return-void
.end method

.method public static ֫(Ll/ۛۚܽ;)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x40

    if-ge v1, v2, :cond_1

    .line 2014
    instance-of v2, p0, Ll/ۚۚܽ;

    if-nez v2, :cond_0

    instance-of v2, p0, Ll/᩺֡ܽ;

    if-eqz v2, :cond_1

    .line 2015
    :cond_0
    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2017
    :cond_1
    instance-of v1, p0, Ll/ۢ֨ܽ;

    if-eqz v1, :cond_2

    check-cast p0, Ll/ۢ֨ܽ;

    iget-object p0, p0, Ll/ۖ֨ܽ;->ۧ:[I

    array-length v1, p0

    if-lez v1, :cond_2

    .line 2018
    aget p0, p0, v0

    if-ltz p0, :cond_2

    const/16 v0, 0x80

    if-ge p0, v0, :cond_2

    return p0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ۨ֡ܽ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨ֡ܽ;->ۧ:[I

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    const/4 v0, 0x0

    .line 1992
    iput-object v0, p0, Ll/ۨ֡ܽ;->ۧ:[I

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1994
    :goto_0
    iget v3, p0, Ll/ۨ֡ܽ;->ܿ:I

    if-ge v2, v3, :cond_3

    .line 1995
    iget-object v3, p0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v3, v3, v2

    invoke-static {v3}, Ll/ۨ֡ܽ;->֫(Ll/ۛۚܽ;)I

    move-result v3

    if-ltz v3, :cond_2

    if-ltz v0, :cond_1

    if-eq v0, v3, :cond_1

    .line 1999
    iget v0, p0, Ll/ۨ֡ܽ;->ܿ:I

    new-array v0, v0, [I

    .line 2000
    :goto_1
    iget v2, p0, Ll/ۨ֡ܽ;->ܿ:I

    if-ge v1, v2, :cond_0

    .line 2001
    iget-object v2, p0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v2, v2, v1

    invoke-static {v2}, Ll/ۨ֡ܽ;->֫(Ll/ۛۚܽ;)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 2003
    :cond_0
    iput-object v0, p0, Ll/ۨ֡ܽ;->ۧ:[I

    return-void

    :cond_1
    move v0, v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
