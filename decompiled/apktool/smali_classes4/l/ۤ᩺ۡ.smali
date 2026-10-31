.class public final synthetic Ll/ۤ᩺ۡ;
.super Ljava/lang/Object;
.source "A5XF"

# interfaces
.implements Ll/᩹ۖܽ;


# instance fields
.field public final synthetic ᩸:Ll/ܽܰۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ܽܰۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ᩺ۡ;->᩸:Ll/ܽܰۡ;

    return-void
.end method


# virtual methods
.method public final ۧ(I)Ll/ۖۖܽ;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۤ᩺ۡ;->᩸:Ll/ܽܰۡ;

    .line 293
    invoke-static {v0}, Ll/ܽܰۡ;->ᩳ(Ll/ܽܰۡ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ᩵ܿ;

    const-string v0, "r"

    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->᩷(Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method
