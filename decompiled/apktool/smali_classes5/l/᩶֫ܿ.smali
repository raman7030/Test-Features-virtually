.class public final synthetic Ll/᩶֫ܿ;
.super Ljava/lang/Object;
.source "76QP"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ۙ֫ܿ;

.field public final synthetic ᩹:Ll/ᩴۗᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ֫ܿ;Ll/ᩴۗᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶֫ܿ;->᩸:Ll/ۙ֫ܿ;

    iput-object p2, p0, Ll/᩶֫ܿ;->᩹:Ll/ᩴۗᩳ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/᩶֫ܿ;->᩸:Ll/ۙ֫ܿ;

    iget-object v1, p0, Ll/᩶֫ܿ;->᩹:Ll/ᩴۗᩳ;

    invoke-static {v0, v1}, Ll/ۙ֫ܿ;->֫(Ll/ۙ֫ܿ;Ll/ᩴۗᩳ;)Ll/ۚۙᩳ;

    move-result-object v0

    return-object v0
.end method
