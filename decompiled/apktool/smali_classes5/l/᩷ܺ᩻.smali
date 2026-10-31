.class public final synthetic Ll/᩷ܺ᩻;
.super Ljava/lang/Object;
.source "5AG2"

# interfaces
.implements Ll/᩶ܺ᩻;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۧ:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ܺ᩻;->֫:Ljava/lang/String;

    iput-boolean p2, p0, Ll/᩷ܺ᩻;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ܺ᩻;)V
    .locals 3

    .line 2
    sget v0, Ll/ۙܺ᩻;->۟:I

    .line 397
    iget-object v0, p0, Ll/᩷ܺ᩻;->֫:Ljava/lang/String;

    invoke-static {v0}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ll/۬ܺ᩻;->ۧ(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 400
    iget-boolean v1, p0, Ll/᩷ܺ᩻;->ۧ:Z

    if-eqz v1, :cond_1

    .line 401
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/۬ܺ᩻;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 402
    :cond_0
    invoke-interface {p1}, Ll/۬ܺ᩻;->᩻()Ljava/io/IOException;

    throw v2

    .line 405
    :cond_1
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/۬ܺ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return-void

    .line 406
    :cond_2
    invoke-interface {p1}, Ll/۬ܺ᩻;->᩻()Ljava/io/IOException;

    throw v2

    .line 398
    :cond_3
    invoke-interface {p1}, Ll/۬ܺ᩻;->᩻()Ljava/io/IOException;

    throw v2
.end method
