.class public final Ll/᩶ܽۧ;
.super Ljava/lang/Object;
.source "58MT"


# instance fields
.field public final ֫:Ll/ܶ۠֫;

.field public ۧ:Ll/ۧܳۧ;


# direct methods
.method public constructor <init>(Ll/ܶ۠֫;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    iput-object p1, p0, Ll/᩶ܽۧ;->֫:Ll/ܶ۠֫;

    .line 73
    new-instance p1, Ll/᩺ܿۧ;

    .line 76
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Ll/᩶ܽۧ;->ۧ:Ll/ۧܳۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫᩵֫;)Ll/ۙܽۧ;
    .locals 3

    .line 161
    new-instance v0, Ll/ۙܽۧ;

    iget-object v1, p0, Ll/᩶ܽۧ;->֫:Ll/ܶ۠֫;

    iget-object v2, p0, Ll/᩶ܽۧ;->ۧ:Ll/ۧܳۧ;

    invoke-direct {v0, p1, v1, v2}, Ll/ۙܽۧ;-><init>(Ll/֫᩵֫;Ll/ܶ۠֫;Ll/ۧܳۧ;)V

    return-object v0
.end method

.method public final ֫(Ll/ۧܳۧ;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 116
    :cond_0
    new-instance p1, Ll/᩺ܿۧ;

    .line 76
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 116
    :goto_0
    iput-object p1, p0, Ll/᩶ܽۧ;->ۧ:Ll/ۧܳۧ;

    return-void
.end method
