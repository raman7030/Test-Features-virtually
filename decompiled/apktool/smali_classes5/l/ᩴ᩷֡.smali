.class public Ll/ᩴ᩷֡;
.super Ljava/lang/Object;
.source "KARP"

# interfaces
.implements Ll/ۘ᩷֡;


# instance fields
.field public ֫:Ll/᩵ܳ֡;

.field public ۧ:Ll/֡ܳ֡;


# direct methods
.method public constructor <init>(Ll/֡ܳ֡;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩷֡;->ۧ:Ll/֡ܳ֡;

    return-void
.end method


# virtual methods
.method public final getChildCount()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ᩴ᩷֡;->ۧ:Ll/֡ܳ֡;

    invoke-interface {v0}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 63
    iget-object v0, p0, Ll/ᩴ᩷֡;->ۧ:Ll/֡ܳ֡;

    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const-string v0, "<EOF>"

    return-object v0

    .line 64
    :cond_0
    invoke-interface {v0}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֡ܳ֡;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ᩴ᩷֡;->ۧ:Ll/֡ܳ֡;

    return-object v0
.end method

.method public final ֫(I)Ll/ܺ᩷֡;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
