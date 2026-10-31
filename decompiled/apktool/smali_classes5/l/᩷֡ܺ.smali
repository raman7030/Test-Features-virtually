.class public final Ll/᩷֡ܺ;
.super Ll/֨ۚܺ;
.source "SB7W"


# static fields
.field public static final ᩶:Ll/᩷֡ܺ;

.field public static final ᩹:Ll/᩷֡ܺ;


# instance fields
.field public ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1354
    new-instance v0, Ll/᩷֡ܺ;

    const/high16 v1, -0x1000000

    invoke-direct {v0, v1}, Ll/᩷֡ܺ;-><init>(I)V

    sput-object v0, Ll/᩷֡ܺ;->᩹:Ll/᩷֡ܺ;

    .line 1355
    new-instance v0, Ll/᩷֡ܺ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/᩷֡ܺ;-><init>(I)V

    sput-object v0, Ll/᩷֡ܺ;->᩶:Ll/᩷֡ܺ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1345
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1359
    iput p1, p0, Ll/᩷֡ܺ;->᩸:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1364
    iget v0, p0, Ll/᩷֡ܺ;->᩸:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "#%08x"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
