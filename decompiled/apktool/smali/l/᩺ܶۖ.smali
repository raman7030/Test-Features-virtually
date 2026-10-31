.class public final Ll/᩺ܶۖ;
.super Ll/۟ܶۖ;
.source "05YL"


# instance fields
.field public final synthetic ۧ:Ll/ۧ᩸ۖ;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۧ᩸ۖ;Ljava/lang/String;)V
    .locals 0

    .line 147
    iput-object p1, p0, Ll/᩺ܶۖ;->ۧ:Ll/ۧ᩸ۖ;

    iput-object p2, p0, Ll/᩺ܶۖ;->ܽ:Ljava/lang/String;

    invoke-direct {p0}, Ll/۟ܶۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 4

    .line 151
    iget-object v0, p0, Ll/᩺ܶۖ;->ۧ:Ll/ۧ᩸ۖ;

    iget-object v0, v0, Ll/ۧ᩸ۖ;->֫:Ljava/util/ArrayList;

    new-instance v1, Ll/֫᩸ۖ;

    iget-object v2, p0, Ll/۟ܶۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Ll/᩺ܶۖ;->ܽ:Ljava/lang/String;

    invoke-direct {v1, v3, v2}, Ll/֫᩸ۖ;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Ll/۟ܶۖ;->֫:Ljava/util/ArrayList;

    return-void
.end method
