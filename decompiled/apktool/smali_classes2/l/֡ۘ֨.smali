.class public final synthetic Ll/֡ۘ֨;
.super Ljava/lang/Object;
.source "P7M1"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/᩶ۘ֨;

.field public final synthetic ᩹:Ljava/io/IOException;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ۘ֨;Ljava/io/IOException;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۘ֨;->᩸:Ll/᩶ۘ֨;

    iput-object p2, p0, Ll/֡ۘ֨;->᩹:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 298
    iget-object v0, p0, Ll/֡ۘ֨;->᩸:Ll/᩶ۘ֨;

    iget-object v0, v0, Ll/᩶ۘ֨;->᩷:Ll/ۛ۠۠;

    .line 299
    iget-object v1, p0, Ll/֡ۘ֨;->᩹:Ljava/io/IOException;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 6817
    new-instance v2, Ll/ۨ۠۠;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v1, "compiler"

    const-string v4, "exception.message"

    invoke-direct {v2, v1, v4, v3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    invoke-virtual {v0, v2}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    return-object v0
.end method
