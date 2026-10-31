.class public final synthetic Ll/ᩴ۟֫;
.super Ljava/lang/Object;
.source "M8RW"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ll/᩸۟֫;


# direct methods
.method public synthetic constructor <init>(Ll/᩸۟֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ۟֫;->᩸:Ll/᩸۟֫;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 781
    iget-object v0, p0, Ll/ᩴ۟֫;->᩸:Ll/᩸۟֫;

    invoke-interface {v0, p2}, Ll/᩸۟֫;->֫(Ljava/lang/Object;)I

    move-result p2

    invoke-interface {v0, p1}, Ll/᩸۟֫;->֫(Ljava/lang/Object;)I

    move-result p1

    sub-int/2addr p2, p1

    return p2
.end method
