.class public final Ll/ۤܶܽ;
.super Ll/۬ۗܿ;
.source "F5MM"


# instance fields
.field public final synthetic ۟:Ll/ۛܶܽ;


# direct methods
.method public constructor <init>(Ll/ۛܶܽ;Ll/ۛܶܽ;)V
    .locals 0

    .line 90
    iput-object p1, p0, Ll/ۤܶܽ;->۟:Ll/ۛܶܽ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 94
    :try_start_0
    iget-object v0, p0, Ll/ۤܶܽ;->۟:Ll/ۛܶܽ;

    invoke-static {v0}, Ll/ۛܶܽ;->֫(Ll/ۛܶܽ;)Ll/ܰܶ֡;

    move-result-object v0

    iget-object v0, v0, Ll/ܰܶ֡;->᩹:Ll/ۘ᩶֡;

    .line 95
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Ll/ۘ᩶֡;->ۨ:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    .line 100
    sput-boolean v0, Ll/᩷᩶ܽ;->ܺۧ:Z

    .line 101
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :catch_0
    move-exception v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    return-void
.end method
