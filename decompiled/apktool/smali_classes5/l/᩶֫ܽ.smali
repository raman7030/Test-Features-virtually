.class public final Ll/᩶֫ܽ;
.super Ll/᩹֫ܽ;
.source "XAPG"


# instance fields
.field public final ֫:Ll/֡֫ܽ;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/Object;

.field public final ᩳ:Ll/᩸֫ܽ;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ll/᩸֫ܽ;Ll/֡֫ܽ;)V
    .locals 1

    const-string v0, "value"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-direct {p0}, Ll/᩹֫ܽ;-><init>()V

    .line 116
    iput-object p1, p0, Ll/᩶֫ܽ;->ܽ:Ljava/lang/Object;

    const-string p1, "SidecarAdapter"

    .line 117
    iput-object p1, p0, Ll/᩶֫ܽ;->ۧ:Ljava/lang/String;

    .line 118
    iput-object p2, p0, Ll/᩶֫ܽ;->ᩳ:Ll/᩸֫ܽ;

    .line 119
    iput-object p3, p0, Ll/᩶֫ܽ;->֫:Ll/֡֫ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 137
    iget-object v0, p0, Ll/᩶֫ܽ;->ܽ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ll/ܺ᩹᩵;)Ll/᩹֫ܽ;
    .locals 6

    .line 123
    iget-object v0, p0, Ll/᩶֫ܽ;->ܽ:Ljava/lang/Object;

    invoke-interface {p2, v0}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    return-object p0

    .line 126
    :cond_0
    new-instance p2, Ll/۠֫ܽ;

    .line 130
    iget-object v4, p0, Ll/᩶֫ܽ;->֫:Ll/֡֫ܽ;

    .line 131
    iget-object v5, p0, Ll/᩶֫ܽ;->ᩳ:Ll/᩸֫ܽ;

    .line 126
    iget-object v1, p0, Ll/᩶֫ܽ;->ܽ:Ljava/lang/Object;

    iget-object v2, p0, Ll/᩶֫ܽ;->ۧ:Ljava/lang/String;

    move-object v0, p2

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Ll/۠֫ܽ;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ll/֡֫ܽ;Ll/᩸֫ܽ;)V

    return-object p2
.end method
