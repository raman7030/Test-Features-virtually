.class public final synthetic Ll/ۢܺ᩻;
.super Ljava/lang/Object;
.source "5AG2"

# interfaces
.implements Ljava/util/function/BooleanSupplier;


# instance fields
.field public final synthetic ᩸:Ll/ۤܺ֡;

.field public final synthetic ᩹:Ll/ۤܺ֡;


# direct methods
.method public synthetic constructor <init>(Ll/ۤܺ֡;Ll/ۤܺ֡;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܺ᩻;->᩸:Ll/ۤܺ֡;

    iput-object p2, p0, Ll/ۢܺ᩻;->᩹:Ll/ۤܺ֡;

    return-void
.end method


# virtual methods
.method public final getAsBoolean()Z
    .locals 4

    .line 2
    sget v0, Ll/ۙܺ᩻;->۟:I

    .line 607
    iget-object v0, p0, Ll/ۢܺ᩻;->᩸:Ll/ۤܺ֡;

    invoke-virtual {v0}, Ll/ۤܺ֡;->᩻()I

    move-result v1

    iget-object v2, p0, Ll/ۢܺ᩻;->᩹:Ll/ۤܺ֡;

    invoke-virtual {v2}, Ll/ۤܺ֡;->᩻()I

    move-result v3

    if-eq v1, v3, :cond_0

    .line 608
    invoke-virtual {v2}, Ll/ۤܺ֡;->᩻()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤܺ֡;->֫(I)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
