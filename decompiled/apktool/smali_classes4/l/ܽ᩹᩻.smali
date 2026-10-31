.class public final Ll/ܽ᩹᩻;
.super Ljava/lang/Object;
.source "8985"

# interfaces
.implements Ll/۠֡ܿ;


# instance fields
.field public final synthetic ֫:Ll/ᩳ᩹᩻;


# direct methods
.method public constructor <init>(Ll/ᩳ᩹᩻;)V
    .locals 0

    .line 274
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩹᩻;->֫:Ll/ᩳ᩹᩻;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    .line 277
    new-instance v0, Ll/᩵ۛۡ;

    int-to-long v1, p1

    invoke-direct {v0, v1, v2}, Ll/᩵ۛۡ;-><init>(J)V

    iget-object p1, p0, Ll/ܽ᩹᩻;->֫:Ll/ᩳ᩹᩻;

    invoke-static {p1}, Ll/ᩳ᩹᩻;->֫(Ll/ᩳ᩹᩻;)Ll/᩺ۤܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺ۤܿ;->ۢ()Ll/ۡۛۡ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    invoke-static {p1, v0}, Ll/ᩳ᩹᩻;->֫(Ll/ᩳ᩹᩻;Ll/᩵ۛۡ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 282
    iget-object v0, p0, Ll/ܽ᩹᩻;->֫:Ll/ᩳ᩹᩻;

    invoke-static {v0}, Ll/ᩳ᩹᩻;->֫(Ll/ᩳ᩹᩻;)Ll/᩺ۤܿ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    .line 283
    invoke-static {v0}, Ll/ᩳ᩹᩻;->ۧ(Ll/ᩳ᩹᩻;)Ll/᩵ۛۡ;

    move-result-object p1

    const/4 v0, 0x1

    .line 41
    invoke-virtual {p1, v0}, Ll/᩵ۛۡ;->֫(I)Z

    return-void
.end method
