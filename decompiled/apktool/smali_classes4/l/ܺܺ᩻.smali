.class public final synthetic Ll/ܺܺ᩻;
.super Ljava/lang/Object;
.source "5AG2"

# interfaces
.implements Ll/᩶ܺ᩻;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۧ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺܺ᩻;->֫:Ljava/lang/String;

    iput-object p2, p0, Ll/ܺܺ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ܺ᩻;)V
    .locals 2

    .line 2
    sget v0, Ll/ۙܺ᩻;->۟:I

    .line 424
    iget-object v0, p0, Ll/ܺܺ᩻;->֫:Ljava/lang/String;

    iget-object v1, p0, Ll/ܺܺ᩻;->ۧ:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Ll/۬ܺ᩻;->ᩳ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 425
    :cond_0
    invoke-interface {p1}, Ll/۬ܺ᩻;->᩻()Ljava/io/IOException;

    const/4 p1, 0x0

    throw p1
.end method
