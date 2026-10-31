.class public final Ll/ᩴۨ᩵;
.super Ljava/lang/Object;
.source "F8BR"


# static fields
.field public static ܽ:Ll/ᩴۨ᩵;


# instance fields
.field public final ֫:[Ll/ۗۘۢ;

.field public final ۧ:Ll/ۖ᩹ۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Ll/ᩴۨ᩵;

    invoke-direct {v0}, Ll/ᩴۨ᩵;-><init>()V

    sput-object v0, Ll/ᩴۨ᩵;->ܽ:Ll/ᩴۨ᩵;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    sget-object v0, Ll/᩶ۨ᩵;->ܽ:Ll/ۗۘۢ;

    .line 48
    sget-object v1, Ll/ۗۨ᩵;->ۧ:Ll/ۖ᩹ۢ;

    iput-object v1, p0, Ll/ᩴۨ᩵;->ۧ:Ll/ۖ᩹ۢ;

    const/16 v1, 0x12

    new-array v1, v1, [Ll/ۗۘۢ;

    .line 49
    iput-object v1, p0, Ll/ᩴۨ᩵;->֫:[Ll/ۗۘۢ;

    const/16 v2, 0x9

    aput-object v0, v1, v2

    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x11

    if-gt v0, v1, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_1

    .line 55
    :cond_0
    iget-object v1, p0, Ll/ᩴۨ᩵;->֫:[Ll/ۗۘۢ;

    new-instance v3, Ll/᩶ۨ᩵;

    invoke-direct {v3, v0}, Ll/᩶ۨ᩵;-><init>(I)V

    aput-object v3, v1, v0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۧ()Ll/ᩴۨ᩵;
    .locals 1

    .line 72
    sget-object v0, Ll/ᩴۨ᩵;->ܽ:Ll/ᩴۨ᩵;

    return-object v0
.end method


# virtual methods
.method public final ֫()Ll/ۖ᩹ۢ;
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ᩴۨ᩵;->ۧ:Ll/ۖ᩹ۢ;

    return-object v0
.end method

.method public final ֫(I)Ll/ۗۘۢ;
    .locals 1

    const/16 v0, 0x11

    if-le p1, v0, :cond_0

    const/16 p1, 0x11

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ge p1, v0, :cond_1

    const/16 p1, 0x9

    .line 120
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ᩴۨ᩵;->֫:[Ll/ۗۘۢ;

    aget-object p1, v0, p1

    return-object p1
.end method
