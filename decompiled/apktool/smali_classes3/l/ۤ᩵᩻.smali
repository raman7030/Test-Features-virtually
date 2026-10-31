.class public final Ll/ۤ᩵᩻;
.super Ljava/lang/Object;
.source "R9JP"


# instance fields
.field public final ֫:Ll/᩹֫ۘ;

.field public final ۧ:Ll/᩻ۧۘ;

.field public final ܽ:Ll/ۛ᩵᩻;

.field public final ᩳ:Ll/ܶܽۘ;


# direct methods
.method public constructor <init>(Ll/ۛ᩵᩻;Ll/᩹֫ۘ;Ll/᩻ۧۘ;Ll/ܶܽۘ;)V
    .locals 0

    .line 791
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 792
    iput-object p1, p0, Ll/ۤ᩵᩻;->ܽ:Ll/ۛ᩵᩻;

    .line 793
    iput-object p2, p0, Ll/ۤ᩵᩻;->֫:Ll/᩹֫ۘ;

    .line 794
    iput-object p3, p0, Ll/ۤ᩵᩻;->ۧ:Ll/᩻ۧۘ;

    .line 795
    iput-object p4, p0, Ll/ۤ᩵᩻;->ᩳ:Ll/ܶܽۘ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۤ᩵᩻;)Ll/ۛ᩵᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤ᩵᩻;->ܽ:Ll/ۛ᩵᩻;

    return-object p0
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 809
    iget-object v0, p0, Ll/ۤ᩵᩻;->ܽ:Ll/ۛ᩵᩻;

    invoke-virtual {v0}, Ll/ۛ᩵᩻;->ᩳ()Ll/۟᩵᩻;

    move-result-object v0

    sget-object v1, Ll/۟᩵᩻;->᩶:Ll/۟᩵᩻;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 816
    iget-object v0, p0, Ll/ۤ᩵᩻;->ܽ:Ll/ۛ᩵᩻;

    invoke-virtual {v0}, Ll/ۛ᩵᩻;->ᩳ()Ll/۟᩵᩻;

    move-result-object v0

    sget-object v1, Ll/۟᩵᩻;->ۙ:Ll/۟᩵᩻;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
