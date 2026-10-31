.class public final Ll/᩵֨᩻;
.super Ll/ܺۘܳ;
.source "89OP"


# instance fields
.field public ۧ֫:Ll/ܰۚ᩻;


# direct methods
.method public constructor <init>(Ll/ܰۚ᩻;)V
    .locals 9

    .line 9
    invoke-virtual {p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܰۚ᩻;->ܽ()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    const-string v2, "/"

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 10
    iput-object p1, p0, Ll/᩵֨᩻;->ۧ֫:Ll/ܰۚ᩻;

    return-void
.end method


# virtual methods
.method public final ܽ()J
    .locals 2

    .line 18
    iget-object v0, p0, Ll/᩵֨᩻;->ۧ֫:Ll/ܰۚ᩻;

    invoke-virtual {v0}, Ll/ܰۚ᩻;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩳ()Ll/ܰۚ᩻;
    .locals 1

    .line 14
    iget-object v0, p0, Ll/᩵֨᩻;->ۧ֫:Ll/ܰۚ᩻;

    return-object v0
.end method

.method public final ᩸()Ljava/lang/CharSequence;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
