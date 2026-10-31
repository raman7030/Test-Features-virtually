.class public final synthetic Ll/ۜܰ᩷;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩸ܰ᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ܰ᩷;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜܰ᩷;->᩸:Ll/᩸ܰ᩷;

    iput-object p2, p0, Ll/ۜܰ᩷;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 712
    iget-object v0, p0, Ll/ۜܰ᩷;->᩸:Ll/᩸ܰ᩷;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ۗܺ᩷;

    .line 713
    new-instance v2, Ll/ᩴܰ᩷;

    iget-object v3, p0, Ll/ۜܰ᩷;->᩹:Ljava/lang/String;

    invoke-direct {v2, v0, v1, v3}, Ll/ᩴܰ᩷;-><init>(Ll/᩸ܰ᩷;Ll/ۗܺ᩷;Ljava/lang/String;)V

    .line 794
    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
