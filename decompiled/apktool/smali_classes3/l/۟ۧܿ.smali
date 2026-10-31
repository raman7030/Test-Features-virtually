.class public final synthetic Ll/۟ۧܿ;
.super Ljava/lang/Object;
.source "35OM"

# interfaces
.implements Ll/ܳܽܿ;


# instance fields
.field public final synthetic ֫:Ll/ۧܽܿ;

.field public final synthetic ۧ:Ll/᩷۟ᩳ;

.field public final synthetic ܽ:Ll/᩷ܽܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۧܽܿ;Ll/᩷۟ᩳ;Ll/᩷ܽܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۧܿ;->֫:Ll/ۧܽܿ;

    iput-object p2, p0, Ll/۟ۧܿ;->ۧ:Ll/᩷۟ᩳ;

    iput-object p3, p0, Ll/۟ۧܿ;->ܽ:Ll/᩷ܽܿ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܰ᩸ᩳ;)Ll/᩷۟ᩳ;
    .locals 7

    .line 513
    iget-object v0, p0, Ll/۟ۧܿ;->֫:Ll/ۧܽܿ;

    iget v4, v0, Ll/ۧܽܿ;->ۙ:I

    iget-object v5, v0, Ll/ۧܽܿ;->ۤ:Ll/ᩳܽܿ;

    new-instance v6, Ll/᩺ۧܿ;

    invoke-direct {v6, v0}, Ll/᩺ۧܿ;-><init>(Ll/ۧܽܿ;)V

    iget-object v2, p0, Ll/۟ۧܿ;->ۧ:Ll/᩷۟ᩳ;

    iget-object v3, p0, Ll/۟ۧܿ;->ܽ:Ll/᩷ܽܿ;

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Ll/ܿܽܿ;->֫(Ll/ܰ᩸ᩳ;Ll/᩷۟ᩳ;Ll/᩷ܽܿ;ILl/ᩳܽܿ;Ll/᩺ۧܿ;)Ll/᩷۟ᩳ;

    move-result-object p1

    return-object p1
.end method
