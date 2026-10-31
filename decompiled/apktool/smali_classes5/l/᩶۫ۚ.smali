.class public final synthetic Ll/᩶۫ۚ;
.super Ljava/lang/Object;
.source "FBFP"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ۢ۫ۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢ۫ۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶۫ۚ;->᩸:Ll/ۢ۫ۚ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩶۫ۚ;->᩸:Ll/ۢ۫ۚ;

    .line 344
    invoke-virtual {v0}, Ll/ۢ۫ۚ;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "addBootstrapMethod: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
