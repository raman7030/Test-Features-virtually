.class public final Ll/ܿ᩷ۚ;
.super Ll/ܳ۬֡;
.source "L4IY"


# instance fields
.field public final ᩶:Ll/ܰ᩷ۚ;

.field public final ᩹:Ll/۟ۢۚ;


# direct methods
.method public constructor <init>(Ll/۟ۢۚ;Ll/ܰ᩷ۚ;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ll/ܿ᩷ۚ;->᩹:Ll/۟ۢۚ;

    .line 48
    iput-object p2, p0, Ll/ܿ᩷ۚ;->᩶:Ll/ܰ᩷ۚ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ܿ᩷ۚ;->᩹:Ll/۟ۢۚ;

    .line 51
    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ll/ۤܽۚ;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ܿ᩷ۚ;->᩶:Ll/ܰ᩷ۚ;

    return-object v0
.end method
