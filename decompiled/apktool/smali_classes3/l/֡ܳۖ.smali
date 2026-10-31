.class public final Ll/֡ܳۖ;
.super Ll/ۖܳۖ;
.source "H88J"


# static fields
.field public static final ܿ:Ljava/util/HashMap;


# instance fields
.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ljava/lang/reflect/Constructor;

.field public final ᩳ:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 606
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    .line 607
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v2, 0x0

    .line 610
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    .line 611
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v2, 0x0

    .line 612
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    sput-object v0, Ll/֡ܳۖ;->ܿ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ll/᩵ܳۖ;Z)V
    .locals 3

    .line 579
    invoke-direct {p0, p2}, Ll/ۖܳۖ;-><init>(Ll/᩵ܳۖ;)V

    .line 576
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Ll/֡ܳۖ;->ۧ:Ljava/util/HashMap;

    .line 580
    invoke-static {p1}, Ll/۬᩻ۖ;->֫(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    iput-object p2, p0, Ll/֡ܳۖ;->ܽ:Ljava/lang/reflect/Constructor;

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    .line 583
    invoke-static {p3, p2}, Ll/ۚܳۖ;->֫(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_0

    .line 586
    :cond_0
    invoke-static {p2}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/AccessibleObject;)V

    .line 589
    :goto_0
    invoke-static {p1}, Ll/۬᩻ۖ;->ۧ(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 590
    :goto_1
    array-length v0, p1

    if-ge p3, v0, :cond_1

    .line 591
    iget-object v0, p0, Ll/֡ܳۖ;->ۧ:Ljava/util/HashMap;

    aget-object v1, p1, p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 593
    :cond_1
    iget-object p1, p0, Ll/֡ܳۖ;->ܽ:Ljava/lang/reflect/Constructor;

    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    .line 598
    array-length p3, p1

    new-array p3, p3, [Ljava/lang/Object;

    iput-object p3, p0, Ll/֡ܳۖ;->ᩳ:[Ljava/lang/Object;

    .line 599
    :goto_2
    array-length p3, p1

    if-ge p2, p3, :cond_2

    .line 601
    iget-object p3, p0, Ll/֡ܳۖ;->ᩳ:[Ljava/lang/Object;

    sget-object v0, Ll/֡ܳۖ;->ܿ:Ljava/util/HashMap;

    aget-object v1, p1, p2

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 568
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "\' with args "

    const-string v1, "Failed to invoke constructor \'"

    .line 645
    iget-object v2, p0, Ll/֡ܳۖ;->ܽ:Ljava/lang/reflect/Constructor;

    :try_start_0
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v3

    .line 661
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 663
    invoke-static {v2}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 666
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v4, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :catch_1
    move-exception v3

    goto :goto_0

    :catch_2
    move-exception v3

    .line 653
    :goto_0
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 655
    invoke-static {v2}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, p1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :catch_3
    move-exception p1

    .line 647
    sget v0, Ll/۬᩻ۖ;->֫:I

    .line 201
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/Object;Ll/ܿۜۖ;Ll/ۘܳۖ;)V
    .locals 2

    .line 568
    check-cast p1, [Ljava/lang/Object;

    .line 626
    iget-object v0, p3, Ll/ۘܳۖ;->ۧ:Ljava/lang/String;

    iget-object v1, p0, Ll/֡ܳۖ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 639
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p2, v0, p1}, Ll/ۘܳۖ;->֫(Ll/ܿۜۖ;I[Ljava/lang/Object;)V

    return-void

    .line 628
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Could not find the index in the constructor \'"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Ll/֡ܳۖ;->ܽ:Ljava/lang/reflect/Constructor;

    .line 630
    invoke-static {p3}, Ll/۬᩻ۖ;->֫(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\' for field with name \'"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 1

    .line 620
    iget-object v0, p0, Ll/֡ܳۖ;->ᩳ:[Ljava/lang/Object;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method
