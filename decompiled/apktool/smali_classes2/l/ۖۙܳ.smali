.class public final synthetic Ll/ۖۙܳ;
.super Ljava/lang/Object;
.source "L73L"

# interfaces
.implements Ll/۠ۙܳ;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۙܳ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 58
    :goto_0
    iget-object v2, p0, Ll/ۖۙܳ;->֫:Ljava/lang/String;

    invoke-static {v1, p1, v2}, Ll/ۚۙܳ;->֫(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    .line 61
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v1, v2, :cond_1

    return v0

    .line 64
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0
.end method
