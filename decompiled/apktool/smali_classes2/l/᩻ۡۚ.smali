.class public final Ll/᩻ۡۚ;
.super Ll/ۚ۬֡;
.source "J5L7"

# interfaces
.implements Ll/ۨۢۚ;


# instance fields
.field public ᩸:I

.field public final ᩹:Ll/۟ۢۚ;


# direct methods
.method public constructor <init>(Ll/۟ۢۚ;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 42
    iput v0, p0, Ll/᩻ۡۚ;->᩸:I

    .line 45
    iput-object p1, p0, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    return-void
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method
