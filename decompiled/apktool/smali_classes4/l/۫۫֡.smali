.class public final Ll/۫۫֡;
.super Ll/۟۬֡;
.source "E4PF"

# interfaces
.implements Ll/ۡۧۚ;


# static fields
.field public static final ۗ:Ll/֨ۗ֡;


# instance fields
.field public final ۙ:I

.field public final ᩶:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 47
    sget-object v0, Ll/֨ۗ֡;->۫֫:Ll/֨ۗ֡;

    sput-object v0, Ll/۫۫֡;->ۗ:Ll/֨ۗ֡;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1

    .line 55
    sget-object v0, Ll/۫۫֡;->ۗ:Ll/֨ۗ֡;

    invoke-direct {p0, v0}, Ll/۟۬֡;-><init>(Ll/֨ۗ֡;)V

    .line 56
    iput p1, p0, Ll/۫۫֡;->ۙ:I

    if-nez p2, :cond_0

    .line 57
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p2

    :cond_0
    iput-object p2, p0, Ll/۫۫֡;->᩶:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 1

    .line 50
    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v0

    iget-object v0, v0, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۚ()I
    .locals 2

    .line 73
    iget-object v0, p0, Ll/۫۫֡;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Ll/۫۫֡;->ۙ:I

    mul-int v0, v0, v1

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 78
    sget-object v0, Ll/۫۫֡;->ۗ:Ll/֨ۗ֡;

    iget-object v0, v0, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    return-object v0
.end method

.method public final ۬()Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/۫۫֡;->᩶:Ljava/util/List;

    return-object v0
.end method

.method public final ᩷()I
    .locals 1

    .line 62
    iget v0, p0, Ll/۫۫֡;->ۙ:I

    return v0
.end method
