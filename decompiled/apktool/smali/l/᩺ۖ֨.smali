.class public final Ll/᩺ۖ֨;
.super Ljava/lang/Object;
.source "57Q8"

# interfaces
.implements Ll/ۢۖ֨;


# static fields
.field public static final ܽ:[Ll/ۢۖ֨;

.field public static final ᩳ:Ll/ۙ֨۠;


# instance fields
.field public final ֫:Ll/֫ᩴ֨;

.field public ۧ:[Ll/ۢۖ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 50
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/᩺ۖ֨;->ᩳ:Ll/ۙ֨۠;

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ۢۖ֨;

    .line 53
    sput-object v0, Ll/᩺ۖ֨;->ܽ:[Ll/ۢۖ֨;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    sget-object v0, Ll/᩺ۖ֨;->ܽ:[Ll/ۢۖ֨;

    iput-object v0, p0, Ll/᩺ۖ֨;->ۧ:[Ll/ۢۖ֨;

    .line 66
    sget-object v0, Ll/᩺ۖ֨;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 103
    const-class v0, Ll/᩸ۖ֨;

    invoke-virtual {p1, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ۖ֨;

    if-nez v0, :cond_0

    .line 116
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 68
    :cond_0
    invoke-static {p1}, Ll/֫ᩴ֨;->֫(Ll/ۗ֨۠;)Ll/֫ᩴ֨;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۖ֨;->֫:Ll/֫ᩴ֨;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/᩺ۖ֨;
    .locals 1

    .line 59
    sget-object v0, Ll/᩺ۖ֨;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۖ֨;

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Ll/᩺ۖ֨;

    invoke-direct {v0, p0}, Ll/᩺ۖ֨;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Ll/᩺ۖ֨;->ۧ:[Ll/ۢۖ֨;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩷ۖ֨;)V
    .locals 6

    .line 127
    iget-object v0, p0, Ll/᩺ۖ֨;->֫:Ll/֫ᩴ֨;

    iget-object v1, v0, Ll/֫ᩴ֨;->ܽ:Ll/۟ۘ֨;

    invoke-virtual {v0, v1}, Ll/֫ᩴ֨;->֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;

    move-result-object v1

    .line 130
    :try_start_0
    iget-object v2, p0, Ll/᩺ۖ֨;->ۧ:[Ll/ۢۖ֨;

    .line 131
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 132
    check-cast v5, Ll/᩺ۖ֨;

    invoke-virtual {v5, p1}, Ll/᩺ۖ֨;->֫(Ll/᩷ۖ֨;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 134
    :cond_0
    invoke-virtual {v0, v1}, Ll/֫ᩴ֨;->֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0, v1}, Ll/֫ᩴ֨;->֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;

    .line 135
    throw p1
.end method

.method public final ֫()Z
    .locals 2

    .line 84
    iget-object v0, p0, Ll/᩺ۖ֨;->ۧ:[Ll/ۢۖ֨;

    sget-object v1, Ll/᩺ۖ֨;->ܽ:[Ll/ۢۖ֨;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Ll/᩷ۖ֨;)V
    .locals 6

    .line 114
    iget-object v0, p0, Ll/᩺ۖ֨;->֫:Ll/֫ᩴ֨;

    iget-object v1, v0, Ll/֫ᩴ֨;->ܽ:Ll/۟ۘ֨;

    invoke-virtual {v0, v1}, Ll/֫ᩴ֨;->֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;

    move-result-object v1

    .line 117
    :try_start_0
    iget-object v2, p0, Ll/᩺ۖ֨;->ۧ:[Ll/ۢۖ֨;

    .line 118
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 119
    check-cast v5, Ll/᩺ۖ֨;

    invoke-virtual {v5, p1}, Ll/᩺ۖ֨;->ۧ(Ll/᩷ۖ֨;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {v0, v1}, Ll/֫ᩴ֨;->֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0, v1}, Ll/֫ᩴ֨;->֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;

    .line 122
    throw p1
.end method
