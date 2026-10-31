.class public final Ll/ܺۤ᩻;
.super Ljava/lang/Object;
.source "M6WW"

# interfaces
.implements Ll/᩺᩵᩷;


# instance fields
.field public final synthetic ᩸:Ll/ܶۤ᩻;

.field public final synthetic ᩹:Z


# direct methods
.method public constructor <init>(Ll/ܶۤ᩻;Z)V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۤ᩻;->᩸:Ll/ܶۤ᩻;

    iput-boolean p2, p0, Ll/ܺۤ᩻;->᩹:Z

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ܺۤ᩻;->᩸:Ll/ܶۤ᩻;

    invoke-static {v0}, Ll/ܶۤ᩻;->ۜ(Ll/ܶۤ᩻;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 154
    iget-object v0, p0, Ll/ܺۤ᩻;->᩸:Ll/ܶۤ᩻;

    invoke-static {v0}, Ll/ܶۤ᩻;->ۜ(Ll/ܶۤ᩻;)V

    .line 155
    invoke-static {v0}, Ll/ܶۤ᩻;->᩻(Ll/ܶۤ᩻;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/ܺۤ᩻;->᩹:Z

    invoke-static {v0, p1, v1}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
