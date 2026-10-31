.class public final Ll/ᩴ᩻ۚ;
.super Ll/ۚ۬֡;
.source "C2RY"


# instance fields
.field public final synthetic ᩸:Ll/᩸ܽۚ;

.field public final synthetic ᩹:Ll/ᩳ᩻ۚ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩻ۚ;Ll/᩸ܽۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    iput-object p1, p0, Ll/ᩴ᩻ۚ;->᩹:Ll/ᩳ᩻ۚ;

    iput-object p2, p0, Ll/ᩴ᩻ۚ;->᩸:Ll/᩸ܽۚ;

    return-void
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 2

    .line 155
    iget-object v0, p0, Ll/ᩴ᩻ۚ;->᩸:Ll/᩸ܽۚ;

    invoke-interface {v0}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ᩴ᩻ۚ;->᩹:Ll/ᩳ᩻ۚ;

    invoke-interface {v1, v0}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
