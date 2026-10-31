.class public final Ll/ܳ۫ܺ;
.super Ljava/lang/Object;
.source "95IB"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:Ljava/util/Comparator;

.field public final ᩹:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;[Ljava/lang/Object;)V
    .locals 0

    .line 782
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 783
    iput-object p1, p0, Ll/ܳ۫ܺ;->᩸:Ljava/util/Comparator;

    .line 784
    iput-object p2, p0, Ll/ܳ۫ܺ;->᩹:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 2

    .line 789
    new-instance v0, Ll/ܿ۫ܺ;

    iget-object v1, p0, Ll/ܳ۫ܺ;->᩸:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ll/ܿ۫ܺ;-><init>(Ljava/util/Comparator;)V

    iget-object v1, p0, Ll/ܳ۫ܺ;->᩹:[Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ll/ܿ۫ܺ;->ۧ([Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ܿ۫ܺ;->֫()Ll/᩻۫ܺ;

    move-result-object v0

    return-object v0
.end method
