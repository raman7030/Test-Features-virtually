.class public final synthetic Ll/᩹۟᩷;
.super Ljava/lang/Object;
.source "O1JS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۗ۟᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗ۟᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹۟᩷;->᩸:Ll/ۗ۟᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 594
    new-instance v0, Ll/۟᩺᩷;

    iget-object v1, p0, Ll/᩹۟᩷;->᩸:Ll/ۗ۟᩷;

    iget-object v1, v1, Ll/ۗ۟᩷;->᩶:Ll/ۛ۟᩷;

    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, v1, v2}, Ll/۟᩺᩷;-><init>(Ll/ۡ᩻֫;Ljava/lang/String;)V

    .line 594
    invoke-static {v1}, Ll/ۛ۟᩷;->ᩳ(Ll/ۛ۟᩷;)Ljava/util/Stack;

    move-result-object v1

    .line 595
    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۛ᩷;

    invoke-virtual {v0, v1}, Ll/۟᩺᩷;->֫(Ll/֨ۛ᩷;)V

    invoke-virtual {v0}, Ll/۟᩺᩷;->֫()V

    return-void
.end method
