.class public final Ll/᩵᩻ۚ;
.super Ll/ۖ۬֡;
.source "C2RY"


# instance fields
.field public final synthetic ᩸:Ll/᩵ܽۚ;

.field public final synthetic ᩹:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/᩵ܽۚ;Ll/ܽܳۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 169
    iput-object p1, p0, Ll/᩵᩻ۚ;->᩸:Ll/᩵ܽۚ;

    iput-object p2, p0, Ll/᩵᩻ۚ;->᩹:Ll/ܽܳۚ;

    return-void
.end method


# virtual methods
.method public final ֫ۧ()I
    .locals 1

    .line 172
    iget-object v0, p0, Ll/᩵᩻ۚ;->᩸:Ll/᩵ܽۚ;

    invoke-interface {v0}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v0

    return v0
.end method

.method public final ᩻ۧ()Ll/۠ܽۚ;
    .locals 2

    .line 178
    iget-object v0, p0, Ll/᩵᩻ۚ;->᩹:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ۜ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/᩵᩻ۚ;->᩸:Ll/᩵ܽۚ;

    invoke-interface {v1}, Ll/᩵ܽۚ;->᩻ۧ()Ll/۠ܽۚ;

    move-result-object v1

    check-cast v1, Ll/ᩴܽۚ;

    invoke-interface {v0, v1}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܽۚ;

    return-object v0
.end method
