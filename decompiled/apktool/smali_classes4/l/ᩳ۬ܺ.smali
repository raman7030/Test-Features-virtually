.class public final Ll/ᩳ۬ܺ;
.super Ljava/lang/Object;
.source "Y4VB"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:[Ljava/lang/Object;


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 698
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 699
    iput-object p1, p0, Ll/ᩳ۬ܺ;->᩸:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 1

    .line 703
    iget-object v0, p0, Ll/ᩳ۬ܺ;->᩸:[Ljava/lang/Object;

    invoke-static {v0}, Ll/ܳ۬ܺ;->֫([Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method
