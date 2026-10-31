.class public final Ll/᩻֨ۜ;
.super Ljava/lang/Object;
.source "I749"

# interfaces
.implements Ll/ܶ۠֫;


# static fields
.field public static final ۤ:Landroid/net/Uri;


# instance fields
.field public final ۗ:Ll/᩻۬ۜ;

.field public final ۙ:Ll/ܽ֨ۜ;

.field public final ۫:Ll/ܶ۠֫;

.field public final ۬:Ll/ܶ֨ۜ;

.field public final ᩶:Ll/᩻ۗۜ;

.field public final ᩸:Ljava/util/function/LongSupplier;

.field public final ᩹:Ll/ۨۚۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "memory://hls-playlist"

    .line 51
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Ll/᩻֨ۜ;->ۤ:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Ll/᩻۬ۜ;Ll/ܶ۠֫;Ll/᩻ۗۜ;Ll/ۨۚۜ;Ll/ܽ֨ۜ;Ljava/util/function/LongSupplier;Ll/ܶ֨ۜ;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput-object p1, p0, Ll/᩻֨ۜ;->ۗ:Ll/᩻۬ۜ;

    .line 132
    iput-object p2, p0, Ll/᩻֨ۜ;->۫:Ll/ܶ۠֫;

    .line 133
    iput-object p3, p0, Ll/᩻֨ۜ;->᩶:Ll/᩻ۗۜ;

    .line 134
    iput-object p4, p0, Ll/᩻֨ۜ;->᩹:Ll/ۨۚۜ;

    .line 135
    iput-object p5, p0, Ll/᩻֨ۜ;->ۙ:Ll/ܽ֨ۜ;

    .line 136
    iput-object p6, p0, Ll/᩻֨ۜ;->᩸:Ljava/util/function/LongSupplier;

    if-nez p7, :cond_1

    .line 138
    sget-object p1, Ll/ܽ֨ۜ;->᩹:Ll/ܽ֨ۜ;

    if-eq p5, p1, :cond_0

    goto :goto_0

    .line 139
    :cond_0
    new-instance p7, Ll/ܶ֨ۜ;

    invoke-direct {p7}, Ll/ܶ֨ۜ;-><init>()V

    :cond_1
    :goto_0
    iput-object p7, p0, Ll/᩻֨ۜ;->۬:Ll/ܶ֨ۜ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻֨ۜ;)Ljava/util/function/LongSupplier;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֨ۜ;->᩸:Ljava/util/function/LongSupplier;

    return-object p0
.end method

.method public static bridge synthetic ۧ()Landroid/net/Uri;
    .locals 1

    .line 0
    sget-object v0, Ll/᩻֨ۜ;->ۤ:Landroid/net/Uri;

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/᩻֨ۜ;)Ll/ۨۚۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֨ۜ;->᩹:Ll/ۨۚۜ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/᩻֨ۜ;)Ll/ܶ֨ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֨ۜ;->۬:Ll/ܶ֨ۜ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩻֨ۜ;)Ll/᩻ۗۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֨ۜ;->᩶:Ll/᩻ۗۜ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩻֨ۜ;)Ll/᩻۬ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֨ۜ;->ۗ:Ll/᩻۬ۜ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩻֨ۜ;)Ll/ܽ֨ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֨ۜ;->ۙ:Ll/ܽ֨ۜ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/᩻֨ۜ;)Ll/ܶ۠֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻֨ۜ;->۫:Ll/ܶ۠֫;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/᩸۠֫;
    .locals 1

    .line 145
    new-instance v0, Ll/ܳ֨ۜ;

    invoke-direct {v0, p0}, Ll/ܳ֨ۜ;-><init>(Ll/᩻֨ۜ;)V

    return-object v0
.end method
