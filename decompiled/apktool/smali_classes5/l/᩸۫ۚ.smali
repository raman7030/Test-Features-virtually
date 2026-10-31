.class public final synthetic Ll/᩸۫ۚ;
.super Ljava/lang/Object;
.source "FBFP"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸۫ۚ;->᩸:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 402
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "check name:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩸۫ۚ;->᩸:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
