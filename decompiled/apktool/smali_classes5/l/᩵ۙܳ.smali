.class public final synthetic Ll/᩵ۙܳ;
.super Ljava/lang/Object;
.source "L73L"

# interfaces
.implements Ll/۠ۙܳ;


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۧ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/᩵ۙܳ;->֫:I

    iput-object p2, p0, Ll/᩵ۙܳ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Z
    .locals 3

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->codePointCount(II)I

    move-result v0

    iget v2, p0, Ll/᩵ۙܳ;->֫:I

    if-ne v0, v2, :cond_0

    .line 41
    iget-object v0, p0, Ll/᩵ۙܳ;->ۧ:Ljava/lang/String;

    invoke-static {v1, p1, v0}, Ll/ۚۙܳ;->֫(ILjava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method
